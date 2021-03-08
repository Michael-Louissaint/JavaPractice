package crackthecode.data;

import crackthecode.models.CTC;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("database")
public class CTCDatabaseDao implements CTCDao {

    private final JdbcTemplate jdbcTemplate;


    public CTCDatabaseDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public CTC add(CTC guess) {
        return null;
    }

    @Override
    public List<CTC> getAll() {
        return null;
    }

    @Override
    public CTC findById(int id) {
        return null;
    }

    @Override
    public boolean update(CTC guess) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
