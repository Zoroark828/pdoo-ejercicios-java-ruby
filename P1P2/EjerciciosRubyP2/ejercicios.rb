# encoding:utf-8

module Ejercicios
  class Parcela

=begin
    Así se declaran los atributos de clase

    @@FACTORALQUILERCALLE = 1.0
    @@FACTORALQUILERCASA = 1.0
    @@FACTORALQUILERHOTEL = 4.0
=end

    # Así se declaran los atributos de instancia de la clase
    @FACTORALQUILERCALLE = 1.0
    @FACTORALQUILERCASA = 1.0
    @FACTORALQUILERHOTEL = 4.0

    # Tenemos que hacer tres metodos que nos devuelvan estos valores porque un
    # metodo de instancia no podrá acceder a ellos de otra forma.
    # Esto no ocurre con los atributos de clase

    def self.factor_alquiler_calle
      @FACTORALQUILERCALLE
    end

    def self.factor_alquiler_casa
      @FACTORALQUILERCASA
    end

    def self.factor_alquiler_hotel
      @FACTORALQUILERHOTEL
    end


    # METODOS DE LA SESION 1

    def initialize(n,pc,pe,pba)
      @nombre = n
      @precio_compra = pc
      @precio_edificar = pe
      @precio_base_alquiler = pba

      @num_casas = 0
      @num_hoteles = 0
    end

    attr_reader :nombre
    attr_reader :precio_compra
    attr_reader :precio_edificar
    attr_reader :num_casas
    attr_reader :num_hoteles

    def get_precio_alquiler_completo
      # Así se hacía con los atributos de clase:
      #precio_alquiler = @precio_base_alquiler * (@@FACTORALQUILERCALLE + @num_casas * @@FACTORALQUILERCASA + @num_hoteles *@@FACTORALQUILERHOTEL)

      # Así se hace con atibutos de instancia de la clase
      precio_alquiler = @precio_base_alquiler * (self.class.factor_alquiler_calle + @num_casas * self.class.factor_alquiler_casa + @num_hoteles * self.class.factor_alquiler_hotel)

      return precio_alquiler
    end

    def construir_casa
      @num_casas = 1 + @num_casas
      return true
    end

    def construir_hotel
      @num_hoteles = 1 + @num_hoteles
      return true
    end

  end






  # COMPROBACIONES

  p = Parcela.new("Parcela verde",10,1,15)

  puts "===== ATRIBUTOS DE LA PARCELA RECIEN CREADA =====",p.nombre, p.precio_compra, p.precio_edificar, p.num_casas, p.num_hoteles

  print "Precio alquiler completo: ", p.get_precio_alquiler_completo, "\n\nSumamos dos casas y un hotel"

  p.construir_casa
  p.construir_casa
  p.construir_hotel

  puts "\nAhora los atributos de la parcela son:",p.nombre, p.precio_compra, p.precio_edificar, p.num_casas, p.num_hoteles

  print "Ahora el precio alquiler completo es: ", p.get_precio_alquiler_completo




  end