"use strict";
class ArchivoXML{
    constructor(nombre){
        this.nombre = nombre;
        this.correcto = "¡Todo correcto! archivo XML cargado"
    }
    cargarDatos(){
        $.ajax({
            dataType: "xml",
            url: this.nombre,
            method: 'GET',
            success: function(datos){
                
                    //Pasar el archivo XML a un string
                    var str = (new XMLSerializer()).serializeToString(datos);
                    
                    $("h5").text(str);
                
                    //Extracción de los datos contenidos en el XML
                    var totalNodos            = $('*',datos).length; // cuenta el número de elementos: son los nodos del DOM de XML
                    var nombre                = $('ruta',datos).attr("nombre");
                    var tipo              = $('tipo',datos).text();
                    var dificultad               = $('dificultad',datos).text();
                    var duracion                  = $('duracion',datos).text();
                    var agencia             = $('agencia',datos).text();
                    var descripcion             = $('descripcion',datos).text();
                    var personas           = $('personas',datos).text();
                    var inicio        = $('inicio',datos).text();
                    var direccionInicio        = $('direccionInicio',datos).text();
                    var coordenadasInicio       = $('coordenadasInicio',datos).text();
                    var referencias               = $('referencias',datos).attr("enlace");
                    var enlace           = $('enlace',datos).text();
                    var recomendacion               = $('recomendacion',datos).text();
                    var nombreHito           = $('hito',datos).attr("nombreHito");
                    var descripcionHito       = $('descripcionHito',datos).text();
                    var coordenadasHito          = $('coordenadasHito',datos).text();
                    var distanciaAnterior       = $('distanciaAnterior',datos).text();
                    var tiempoAnterior          = $('tiempoAnterior',datos).text();
                    var fotoHito = $('fotoHito',datos).text();
                    var videoHito             = $('videoHito',datos).text();
                    
                    var stringDatos =  "<ul><li>Número de elementos del archivo XML: " + totalNodos + "</li> ";
                        stringDatos += "<li>Nombre: " + nombre + "</li>";
                        stringDatos += "<li>Tipo: " + tipo + "</li>";
                        stringDatos += "<li>Dificultad: " + dificultad + "</li>";
                        stringDatos += "<li>Duracion: " + duracion + "</li>";
                        stringDatos += "<li>Agencia: " + agencia + "</li>";
                        stringDatos += "<li>Descripcion: " + descripcion + "</li>";
                        stringDatos += "<li>Personas: " + personas + "</li>";
                        stringDatos += "<li>Inicio: " + inicio + "</li>";
                        stringDatos += "<li>direccionInicio: " + direccionInicio + "</li>";
                        stringDatos += "<li>CoordenadasInicio: " + coordenadasInicio + "</li>";
                        stringDatos += "<li>Referencias: " + referencias + "</li>";
                        stringDatos += "<li>Enlace: " + enlace + "</li>";
                        stringDatos += "<li>Recomendacion: " + recomendacion + "</li>";
                        stringDatos += "<li>NombreHito: " + nombreHito + "</li>";
                        stringDatos += "<li>DescripcionHito: " + descripcionHito + "</li>";
                        stringDatos += "<li>CoordenadasHito: " + coordenadasHito + "</li>";
                        stringDatos += "<li>DistanciaAnterior: " + distanciaAnterior + "</li>";
                        stringDatos += "<li>TiempoAnterior: " + tiempoAnterior + "</li>";
                        stringDatos += "<li>FotoHito: " + fotoHito + "</li>";
                        stringDatos += "<li>VideoHito: " + videoHito + "</li>";
                    
                    $("p").html(stringDatos);                  
                },
            error:function(){
                $("h3").html("¡Tenemos problemas! No se pudo cargar el archivo XML"); 
                $("h4").remove();
                $("h5").remove();
                $("p").remove();
                }
        });
    }
    crearElemento(tipoElemento, texto, insertarAntesDe){
        // Crea un nuevo elemento modificando el árbol DOM
        // El elemnto creado es de 'tipoElemento' con un 'texto' 
        // El elemnto se coloca antes del elemnto 'insertarAntesDe'
        var elemento = document.createElement(tipoElemento); 
        elemento.innerHTML = texto;
        $(insertarAntesDe).before(elemento);
    }
    verXML(){
        //Muestra el archivo JSON recibido
        this.crearElemento("h2","Archivo XML","footer"); 
        this.crearElemento("h3",this.correcto,"footer"); // Crea un elemento con DOM 
        this.crearElemento("h4","XML","footer"); // Crea un elemento con DOM        
        this.crearElemento("h5","","footer"); // Crea un elemento con DOM para el string con XML
        this.crearElemento("h4","Datos","footer"); // Crea un elemento con DOM 
        this.crearElemento("p","","footer"); // Crea un elemento con DOM para los datos obtenidos con XML
        this.cargarDatos();
        $("button").attr("disabled","disabled");
    }
    
}
var rutas = new ArchivoXML("rutas.xml");