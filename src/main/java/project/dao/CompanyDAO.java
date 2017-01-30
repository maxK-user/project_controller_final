package project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import project.entities.Company;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component("companyDAO")
public class CompanyDAO {
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    // в транзакциї є сенс, коли об'єкти містять в собі інші об'єкти (наприклад, як Контракт)
    // readOnly = true (для оптимізації селектів)
    //@Transactional(propagation = Propagation.REQUIRED, readOnly = true, isolation = Isolation.REPEATABLE_READ)
    public Company selectCompanyById(long id){
        String sql = "SELECT * FROM company where id=:id";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);

        Company company = jdbcTemplate.queryForObject(sql, params, new CompanyRowMapper());
        return company;
    }

    private static final class CompanyRowMapper implements RowMapper<Company> {

        @Override
        public Company mapRow(ResultSet resultSet, int i) throws SQLException {
            Company company = new Company();
            company.setId(resultSet.getInt("id"));
            company.setName(resultSet.getString("name"));
            return company;
        }
    }
}
