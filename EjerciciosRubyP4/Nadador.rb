# encoding:utf-8

module Herencia
  class Nadador < Deportista
    # Los nadadores son deportistas (y por tanto, personas) que pueden andar, ir a competiciones
    # deportivas y, además, correr (metodo propio)
    def nadar
      result = "Estoy nadando"
    end

    # Redefinicion:
    def to_s
      result = super.to_s + " y soy nadador"
    end
  end
end
