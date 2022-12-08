# encoding:utf-8

module Herencia
  class Corredor < Deportista
    # Los corredores son deportistas (y por tanto, personas) que pueden andar, ir a competiciones
    # deportivas y, además, correr (metodo propio)
    def correr
      result = "Estoy corriendo"
    end

    # Redefinicion:
    def to_s
      result = super.to_s + " y soy corredor"
    end
  end
end
