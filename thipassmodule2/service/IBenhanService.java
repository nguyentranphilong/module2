package thipassmodule2.service;

import thipassmodule2.model.BenhanNor;

import java.util.List;

public interface IBenhanService {
    List<BenhanNor> findAll();

    void add(BenhanNor teacher);

    void update(BenhanNor teacher);

    void delete(int id);

    BenhanNor findById(int id);

}
