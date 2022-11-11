package domain.crud;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
class ClienteController {

  private final ClienteRepository repository;

  ClienteController(ClienteRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/clientes")
  List<Cliente> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/clientes")
  Cliente newEmployee(@RequestBody Cliente novoCliente) {
    return repository.save(novoCliente);
  }

  // Single item
  
  @GetMapping("/clientes/{id}")
  Cliente one(@PathVariable Long id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new ClienteNotFoundException(id));
  }

  @PutMapping("/clientes/{id}")
  Cliente replaceEmployee(@RequestBody Cliente novoCliente, @PathVariable Long id) {
    
    return repository.findById(id)
      .map(cliente -> {
        cliente.setNome(novoCliente.getNome());
        cliente.setContato(novoCliente.getContato());
        return repository.save(cliente);
      })
      .orElseGet(() -> {
        novoCliente.setId(id);
        return repository.save(novoCliente);
      });
  }

  @DeleteMapping("/clientes/{id}")
  void deleteEmployee(@PathVariable Long id) {
    repository.deleteById(id);
  }
}