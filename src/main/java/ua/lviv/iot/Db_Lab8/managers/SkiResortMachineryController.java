package ua.lviv.iot.Db_Lab8.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkiResortMachineryController {

	@Autowired
	public SkiResortMachineryRepository repository;

	@GetMapping("/machineries")
	public List<SkiResortMachinery> getMachineries() {
		return (List<SkiResortMachinery>) repository.findAll();
	}

	@GetMapping("/machineries/{id}")
	public SkiResortMachinery getMachinery(@PathVariable Integer id) {
		return repository.findById(id).get();
	}

	@PutMapping("/machineries/{id}")
	public SkiResortMachinery putMachinery(@RequestBody SkiResortMachinery newMachinery, @PathVariable Integer id) {
		return repository.findById(id).map(machinery -> {
			machinery.setName(newMachinery.getName());
			machinery.setProducer(newMachinery.getProducer());
			machinery.setFuelPerHour(newMachinery.getFuelPerHour());
			machinery.setMileage(newMachinery.getMileage());
			machinery.setTypeOfFuel(newMachinery.getTypeOfFuel());
			machinery.setWheelFormula(newMachinery.getWheelFormula());
			return repository.save(machinery);
		}).orElseGet(() -> {
			newMachinery.setId(id);
			return repository.save(newMachinery);
		});
	}

	@PostMapping("/machineries/{id}")
	public SkiResortMachinery postMachienry(@RequestBody SkiResortMachinery machinery) {
		return repository.save(machinery);
	}

	@DeleteMapping("/machineries/{id}")
	public SkiResortMachinery deleteMachinery(@PathVariable Integer id) {
		SkiResortMachinery idOfObject = getMachinery(id);
		repository.deleteById(id);
		return idOfObject;
	}

}
