package foodlovers;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = {"http://localhost", "http://localhost:8000"})
@RepositoryRestResource(collectionResourceRel = "combinacoes", path = "combinacoes")
public interface CombinacoesRepository extends PagingAndSortingRepository<Combinacoes, Long> {


}