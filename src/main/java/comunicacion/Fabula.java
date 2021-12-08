package comunicacion;

public class Fabula extends Escrito{

    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        // TODO Auto-generated method stub
        return super.getPaginas()*palabrasPagina*1;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s\n%s\n%s\n%s\n%s", super.getOrigen(), super.getTitulo(), super.getAutor(), super.getPaginas(), ensenanza);
    }
    
}
