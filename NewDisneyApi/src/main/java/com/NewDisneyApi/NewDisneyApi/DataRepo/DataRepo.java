package com.NewDisneyApi.NewDisneyApi.DataRepo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
@RepositoryRestResource(collectionResourceRel = "movieCharacter", path = "movieCharacter")
public interface DataRepo extends PagingAndSortingRepository<MovieCharacter, Long>{
    List<MovieCharacter> findByNombre(@Param("nombre") String nombre);

}
