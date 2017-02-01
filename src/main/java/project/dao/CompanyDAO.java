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
import java.util.List;

@Component("companyDAO")
public class CompanyDAO implements GenericDAO<Company>{
    private NamedParameterJdbcTemplate jdbcTemplate;

    private static final String SELECT_BY_ID = "SELECT * FROM company where id = :id";
    private static final String SELECT_ALL = "SELECT * FROM company";
    private static final String INSERT = "INSERT INTO public.company(name) VALUES (:name)";
    private static final String UPDATE = "UPDATE public.company SET name= :newName WHERE id = :oldId;";
    private static final String DELETE = "DELETE FROM public.company WHERE id = :id";

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public Company getById(long id) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        return jdbcTemplate.queryForObject(SELECT_BY_ID, params, new CompanyRowMapper());
    }

    @Override
    public List<Company> getAll() {
        return jdbcTemplate.query(SELECT_ALL, new CompanyRowMapper());
    }

    @Override
    public boolean insert(Company company) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", company.getName());
        int returnedValue = jdbcTemplate.update(INSERT, params);

        if(returnedValue != 1){
            return false;
        }
        return true;
    }

    @Override
    public boolean update(Company company) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("newName", company.getName());
        params.addValue("oldId", company.getId());
        int returnedValue = jdbcTemplate.update(UPDATE,  params);
        if(returnedValue != 1){
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteById(long id) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        int returnedValue = jdbcTemplate.update(DELETE, params);
        if(returnedValue != 1){
            return false;
        }
        return true;
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
