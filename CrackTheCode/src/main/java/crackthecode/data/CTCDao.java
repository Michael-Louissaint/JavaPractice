package crackthecode.data;

import crackthecode.models.CTC;
import java.util.List;

public interface CTCDao {

    CTC add(CTC guess);

    List<CTC> getAll();

    CTC findById(int id);

    // true if item exists and is updated
    boolean update(CTC guess);

    // true if item exists and is deleted
    boolean deleteById(int id);



}
