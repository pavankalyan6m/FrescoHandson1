package frescoPlay.SpringSecurity.Handson.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

import frescoPlay.SpringSecurity.Handson.Entity.Hospital;
import frescoPlay.SpringSecurity.Handson.Service.HospitalService;

@RestController

@RequestMapping("/test/")

public class HospitalController {

	@Autowired

	private HospitalService hospitalService;

	@GetMapping("hospitals/{id}")

	public @ResponseBody Optional<Hospital> getHospital(@PathVariable("id") int id) throws Exception {

		return hospitalService.getHospital(id);

	}

	@GetMapping("hospitals/")

	public @ResponseBody List<Hospital> getAllHospitals() throws Exception {

		return hospitalService.getAllHospitals();

	}

	@PostMapping("hospitals/")

	public ResponseEntity<String> addHospital(@RequestBody Hospital hospital) {

		hospitalService.addHospital(hospital);

//URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sevedUser.getId()).toUri();

		return new ResponseEntity<>(HttpStatus.OK);

	}

	@PostMapping("hospitals/update") // Add a path for updating hospitals
	
	public ResponseEntity<String> updateHospital(@RequestBody Hospital hospital) {
		hospitalService.updateHospital(hospital);
		return ResponseEntity.ok("ok");
	}

	
	@DeleteMapping("hospitals/")

	public ResponseEntity<String> deleteHospital(@RequestBody Hospital hospital) {

		hospitalService.deleteHospital(hospital);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}

}
