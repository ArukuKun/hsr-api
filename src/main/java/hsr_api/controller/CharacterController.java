package hsr_api.controller;

import hsr_api.model.Character;
import hsr_api.repository.CharacterRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/characters")
public class CharacterController {

    private final CharacterRepository repository;

    public CharacterController(CharacterRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Character> getAllCharacters() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Character createCharacter(@RequestBody Character character) {
        return repository.save(character);
    }

    @PutMapping("/{id}")
    public Character updateCharacter(@PathVariable String id, @RequestBody Character characterDetails) {
        return repository.findById(id)
                .map(existingCharacter -> {
                    // Actualizamos los campos con los nuevos datos
                    existingCharacter.setNombre(characterDetails.getNombre());
                    existingCharacter.setRareza(characterDetails.getRareza());
                    existingCharacter.setVia(characterDetails.getVia());
                    existingCharacter.setElemento(characterDetails.getElemento());
                    existingCharacter.setHpBase(characterDetails.getHpBase());
                    existingCharacter.setAtkBase(characterDetails.getAtkBase());
                    existingCharacter.setDefBase(characterDetails.getDefBase());
                    existingCharacter.setSpdBase(characterDetails.getSpdBase());
                    
                    return repository.save(existingCharacter);
                })
                .orElseThrow(() -> new RuntimeException("Personaje no encontrado con id: " + id));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCharacter(@PathVariable String id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Personaje no encontrado con id: " + id);
        }
        repository.deleteById(id);
    }
}