# encoding:utf-8

module Herencia
  class Deportista < Persona
    # Los deportistas andan como las personas (metodo heredado)
    # y además van a competiciones deportivas (metodo propio)
    # También tienen un atributo más que las personas corrientes: las horas de entrenamiento
    def initialize (nombre,horas)
      super(nombre)
      @horas_entrenamiento = horas
    end

    def competicion_deportiva
      result = "Estoy participando en una competicion deportiva"
    end
  end
end




