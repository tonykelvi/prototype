package domain.crud;

class ClienteNotFoundException extends RuntimeException {

  ClienteNotFoundException(Long id) {
      super("Não consegui encontrar o cliente " + id);
    }
  }