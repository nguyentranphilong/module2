package thipassmodule2.service;

import thipassmodule2.repository.IBenhanNorRepo;
import thipassmodule2.repository.BenhanNorRepo;

import java.util.List;

public class BenhanService implements IBenhanService {
    private final IBenhanNorRepo iBenhnhanNorRepo = new BenhanNorRepo();
    @Override
    public List<thipassmodule2.model.BenhanNor> findAll() {
        return iBenhnhanNorRepo.findAll();
    }

    @Override
    public void add(thipassmodule2.model.BenhanNor teacher) {
        iBenhnhanNorRepo.add(teacher);

    }

    @Override
    public void update(thipassmodule2.model.BenhanNor teacher) {
        iBenhnhanNorRepo.update(teacher);

    }

    @Override
    public void delete(int id) {
        iBenhnhanNorRepo.delete(id);

    }

    @Override
    public thipassmodule2.model.BenhanNor findById(int id) {
        return iBenhnhanNorRepo.findById(id);
    }
}
