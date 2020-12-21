package co.simplon.breizhvideo.repository;

import co.simplon.breizhvideo.model.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageRepository extends JpaRepository<Village, Long> {

}
