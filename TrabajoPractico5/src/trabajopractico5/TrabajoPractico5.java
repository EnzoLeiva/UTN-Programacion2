package trabajopractico5;
import java.util.Date;
public class TrabajoPractico5 {
    public static void main(String[] args) {
    }
    
    //Ejercicio 1
    class Foto {
        private String imagen;
        private String formato;
        public Foto(String imagen, String formato) { this.imagen = imagen; this.formato = formato; }
    }

    class Titular {
        private String nombre;
        private String dni;
        private Pasaporte pasaporte;
        public Titular(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
        public void setPasaporte(Pasaporte p) { this.pasaporte = p; }
    }

    class Pasaporte {
        private String numero;
        private Date fechaEmision;
        private Foto foto;
        private Titular titular;
        public Pasaporte(String num, String fecha, String img, String formato, Titular t) {
            this.numero = num;
            this.fechaEmision = fecha;
            this.foto = new Foto(img, formato);
            this.titular = t;
            t.setPasaporte(this);
        }
    }
    
    //Ejercicio 2
    class Bateria {
        private String modelo;
        private int capacidad;

        public Bateria(String modelo, int capacidad) {
            this.modelo = modelo;
            this.capacidad = capacidad;
        }
    }

    class Usuario {
        private String nombre;
        private String dni;
        private Celular celular;

        public Usuario(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setCelular(Celular celular) {
            this.celular = celular;
        }
    }

    class Celular {
        private String imei;
        private String marca;
        private String modelo;
        private Bateria bateria;
        private Usuario usuario;

        public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
            this.imei = imei;
            this.marca = marca;
            this.modelo = modelo;
            this.bateria = bateria;
            this.usuario = usuario;
            usuario.setCelular(this);
        }
    }
    
    //Ejercicio 3
    class Autor {
        private String nombre;
        private String nacionalidad;

        public Autor(String nombre, String nacionalidad) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }
    }

    class Editorial {
        private String nombre;
        private String direccion;

        public Editorial(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }
    }

    class Libro {
        private String titulo;
        private String isbn;
        private Autor autor;
        private Editorial editorial;

        public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
            this.titulo = titulo;
            this.isbn = isbn;
            this.autor = autor;
            this.editorial = editorial;
        }
    }
    
    //Ejercicio 4
    class Cliente {
        private String nombre;
        private String dni;
        private TarjetaDeCredito tarjeta;

        public Cliente(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setTarjeta(TarjetaDeCredito tarjeta) {
            this.tarjeta = tarjeta;
        }
    }

    class Banco {
        private String nombre;
        private String cuit;

        public Banco(String nombre, String cuit) {
            this.nombre = nombre;
            this.cuit = cuit;
        }
    }

    class TarjetaDeCredito {
        private String numero;
        private Date fechaVencimiento;
        private Cliente cliente; 
        private Banco banco;

        public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
            this.numero = numero;
            this.fechaVencimiento = fechaVencimiento;
            this.cliente = cliente;
            this.banco = banco;
            cliente.setTarjeta(this);
        }
    }
    
    //Ejercicio 5
    class PlacaMadre {
        private String modelo;
        private String chipset;

        public PlacaMadre(String modelo, String chipset) {
            this.modelo = modelo;
            this.chipset = chipset;
        }
    }

    class Propietario {
        private String nombre;
        private String dni;
        private Computadora computadora;

        public Propietario(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setComputadora(Computadora computadora) {
            this.computadora = computadora;
        }
    }

    class Computadora {
        private String marca;
        private String numeroSerie;
        private PlacaMadre placaMadre;
        private Propietario propietario;

        public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset, Propietario propietario) {
            this.marca = marca;
            this.numeroSerie = numeroSerie;
            this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
            this.propietario = propietario;
            propietario.setComputadora(this);
        }
    }
    //Ejercicio 6
    class Cliente {
        private String nombre;
        private String telefono;

        public Cliente(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }
    }

    class Mesa {
        private int numero;
        private int capacidad;

        public Mesa(int numero, int capacidad) {
            this.numero = numero;
            this.capacidad = capacidad;
        }
    }

    class Reserva {
        private Date fecha;
        private Date hora;
        private Cliente cliente;
        private Mesa mesa; 

        public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
            this.fecha = fecha;
            this.hora = hora;
            this.cliente = cliente;
            this.mesa = mesa;
        }
    }

    //Ejercicio 7
    class Vehiculo {
        private String patente;
        private String modelo;
        private Motor motor; 
        private Conductor conductor;

        public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
            this.patente = patente;
            this.modelo = modelo;
            this.motor = motor;
            this.conductor = conductor;
        }
    }

    class Motor {
        private String tipo;
        private String numeroSerie;

        public Motor(String tipo, String numeroSerie) {
            this.tipo = tipo;
            this.numeroSerie = numeroSerie;
        }
    }

    class Conductor {
        private String nombre;
        private String licencia;
        private Vehiculo vehiculo;

        public Conductor(String nombre, String licencia, Vehiculo vehiculo) {
            this.nombre = nombre;
            this.licencia = licencia;
            this.vehiculo = vehiculo;
        }
    }

    //Ejercicio 8
    class Documento {
        private String titulo;
        private String contenido;
        private FirmaDigital firma;

        public Documento(String titulo, String contenido, FirmaDigital firma) {
            this.titulo = titulo;
            this.contenido = contenido;
            this.firma = firma;
        }
    }

    class FirmaDigital {
        private String codigoHash;
        private Date fecha;
        private Usuario usuario;

        public FirmaDigital(String codigoHash, Date fecha, Usuario usuario) {
            this.codigoHash = codigoHash;
            this.fecha = fecha;
            this.usuario = usuario;
        }
    }

    class Usuario {
        private String nombre;
        private String email;

        public Usuario(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }
    }
    
    //Ejercicio 9
    class CitaMedica {
        private Date fecha;
        private String hora;
        private Paciente paciente;
        private Profesional profesional;

        public CitaMedica(Date fecha, String hora, Paciente paciente, Profesional profesional) {
            this.fecha = fecha;
            this.hora = hora;
            this.paciente = paciente;
            this.profesional = profesional;
        }
    }

    class Paciente {
        private String nombre;
        private String obraSocial;

        public Paciente(String nombre, String obraSocial) {
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }
    }

    class Profesional {
        private String nombre;
        private String especialidad;

        public Profesional(String nombre, String especialidad) {
            this.nombre = nombre;
            this.especialidad = especialidad;
        }
    }
    
    //Ejercicio 10
    class CuentaBancaria {
        private String cbu;
        private double saldo;
        private ClaveSeguridad clave;
        private Titular titular;

        public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
            this.cbu = cbu;
            this.saldo = saldo;
            this.clave = clave;
            this.titular = titular;
        }
    }

    class ClaveSeguridad {
        private String codigo;
        private Date ultimaModificacion;

        public ClaveSeguridad(String codigo, Date ultimaModificacion) {
            this.codigo = codigo;
            this.ultimaModificacion = ultimaModificacion;
        }
    }

    class Titular {
        private String nombre;
        private String dni;
        private CuentaBancaria cuenta;

        public Titular(String nombre, String dni, CuentaBancaria cuenta) {
            this.nombre = nombre;
            this.dni = dni;
            this.cuenta = cuenta;
        }
    }
    
    //Ejercicio 11
    class Cancion {
        private String titulo;
        private Artista artista;

        public Cancion(String titulo, Artista artista) {
            this.titulo = titulo;
            this.artista = artista;
        }
    }

    class Artista {
        private String nombre;
        private String genero;

        public Artista(String nombre, String genero) {
            this.nombre = nombre;
            this.genero = genero;
        }
    }

    class Reproductor {
        public void reproducir(Cancion cancion) {
            System.out.println("Reproduciendo: " + cancion);
        }
    }
    
    //Ejercicio 12
    class Impuesto {
        private double monto;
        private Contribuyente contribuyente;

        public Impuesto(double monto, Contribuyente contribuyente) {
            this.monto = monto;
            this.contribuyente = contribuyente;
        }
    }

    class Contribuyente {
        private String nombre;
        private String cuil;

        public Contribuyente(String nombre, String cuil) {
            this.nombre = nombre;
            this.cuil = cuil;
        }
    }

    class Calculadora {
        public void calcular(Impuesto impuesto) {
            System.out.println("Calculando impuesto: " + impuesto);
        }
    }
    
    //Ejercicio 13
    class CodigoQR {
        private String valor;
        private Usuario usuario;

        public CodigoQR(String valor, Usuario usuario) {
            this.valor = valor;
            this.usuario = usuario;
        }
    }

    class Usuario {
        private String nombre;
        private String email;

        public Usuario(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }
    }

    class GeneradorQR {
        public void generar(String valor, Usuario usuario) {
            CodigoQR qr = new CodigoQR(valor, usuario);
            System.out.println("QR generado para usuario: " + usuario);
        }
    }
    
    //Ejercicio 14
    class Render {
        private String formato;
        private Proyecto proyecto;

        public Render(String formato, Proyecto proyecto) {
            this.formato = formato;
            this.proyecto = proyecto;
        }
    }

    class Proyecto {
        private String nombre;
        private int duracionMin;

        public Proyecto(String nombre, int duracionMin) {
            this.nombre = nombre;
            this.duracionMin = duracionMin;
        }
    }

    class EditorVideo {
        public void exportar(String formato, Proyecto proyecto) {
            Render render = new Render(formato, proyecto);
            System.out.println("Exportando proyecto: " + proyecto + " en formato: " + formato);
        }
    }
}
