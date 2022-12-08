# encoding:utf-8

require_relative 'Persona'
require_relative 'Deportista'
require_relative 'Corredor'
require_relative 'Nadador'

module Herencia
  # 2. Crea un objeto de las cuatro clase y utiliza el metodo "andar"
  persona = Persona.new("PPPPersona")
  deportista = Deportista.new("DDDDeportista",2)
  corredor = Corredor.new("CCCCorredor",4)
  nadador = Nadador.new("NNNNadador",6)

  print persona.andar, "\n", deportista.andar, "\n", corredor.andar, "\n", nadador.andar, "\n\n\n"

  # En las clases heredadas no es necesario hacer un constructor, porque heredará los atributos de
  # la clase Deportista.








  # 3. Con los diferentes deportistas, prueba quien puede acceder a qué metodo
  # Los tres pueden acceder a andar, porque lo heredaron de Persona
  # Los tres pueden acceder a to_s, aunque imprimen distinta informacion:
  print deportista.to_s, "\n", corredor.to_s, "\n", nadador.to_s, "\n\n\n"

  # Los tres pueden acceder al metodo competicion_deportiva obteniendo el mismo resultado
  print deportista.competicion_deportiva, "\n", corredor.competicion_deportiva, "\n", nadador.competicion_deportiva,"\n\n\n"

  # Deportista no puede acceder ni a correr ni a nadar. Las clases hijas si pueden acceder a su
  # correspondiente metodo
  print corredor.correr, "\n", nadador.nadar,"\n\n\n"





end