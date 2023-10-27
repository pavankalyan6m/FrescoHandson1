package frescoPlay.SpringSecurity.Handson.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import frescoPlay.SpringSecurity.Handson.Entity.Hospital;

@Repository

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
