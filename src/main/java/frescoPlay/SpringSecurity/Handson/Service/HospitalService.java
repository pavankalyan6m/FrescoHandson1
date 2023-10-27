package frescoPlay.SpringSecurity.Handson.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frescoPlay.SpringSecurity.Handson.Entity.Hospital;
import frescoPlay.SpringSecurity.Handson.Repository.HospitalRepository;

@Service

public class HospitalService {

	@Autowired

	private HospitalRepository hospitalRepository;

	public List<Hospital> getAllHospitals() {

		List<Hospital> hos = new ArrayList<Hospital>();

		hospitalRepository.findAll().forEach(hos1 -> hos.add(hos1));

		return hos;

	}

	public Optional<Hospital> getHospital(int id) {

		return hospitalRepository.findById(id);

	}

	public void addHospital(Hospital hospital) {

		hospitalRepository.save(hospital);

	}

	public void updateHospital(Hospital hos) {
	    // Directly save the updated hospital
	    hospitalRepository.save(hos);
	}


	public void deleteHospital(Hospital hospital) {

		hospitalRepository.delete(hospital);

	}

}