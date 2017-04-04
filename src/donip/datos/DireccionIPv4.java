package donip.datos;

public class DireccionIPv4 {
    private Integer primerosBytes;
    private Integer segundosBytes;
    private Integer tercerosBytes;
    private Integer cuartosBytes;
    private String clase;
    private String mascara;
    private String dirDeRed;
    private String dirBroadcast;

    public Integer getPrimerosBytes() {
        return primerosBytes;
    }

    public void setPrimerosBytes(Integer primerosBytes) {
        this.primerosBytes = primerosBytes;
    }

    public Integer getSegundosBytes() {
        return segundosBytes;
    }

    public void setSegundosBytes(Integer segundosBytes) {
        this.segundosBytes = segundosBytes;
    }

    public Integer getTercerosBytes() {
        return tercerosBytes;
    }

    public void setTercerosBytes(Integer tercerosBytes) {
        this.tercerosBytes = tercerosBytes;
    }

    public Integer getCuartosBytes() {
        return cuartosBytes;
    }

    public void setCuartosBytes(Integer cuartosBytes) {
        this.cuartosBytes = cuartosBytes;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getDirDeRed() {
        return dirDeRed;
    }

    public void setDirDeRed(String dirDeRed) {
        this.dirDeRed = dirDeRed;
    }

    public String getDirBroadcast() {
        return dirBroadcast;
    }

    public void setDirBroadcast(String dirBroadcast) {
        this.dirBroadcast = dirBroadcast;
    }
    
    public DireccionIPv4 sacarClase(DireccionIPv4 ipv4){
        
        if(ipv4.getPrimerosBytes() >= 0 && ipv4.getPrimerosBytes() < 128){
            ipv4.setClase("A");
        }
        
        if(ipv4.getPrimerosBytes() > 127 && ipv4.getPrimerosBytes() < 192){
            ipv4.setClase("B");
        }
        
        if(ipv4.getPrimerosBytes() > 191 && ipv4.getPrimerosBytes() < 224){
            ipv4.setClase("C");
        }
        
        if(ipv4.getPrimerosBytes() > 223 && ipv4.getPrimerosBytes() < 240){
            ipv4.setClase("D");
        }
        
        if(ipv4.getPrimerosBytes() > 239 && ipv4.getPrimerosBytes() < 256){
            ipv4.setClase("E");            
        }
        
        return ipv4;
    }
    
    public DireccionIPv4 sacarDirDeRed(DireccionIPv4 ipv4){
        
        switch (ipv4.getClase()){
            case "A":
                ipv4.setDirDeRed(ipv4.getPrimerosBytes()+".0.0.0");
                ipv4.setMascara("255.0.0.0");
                ipv4.setDirBroadcast(ipv4.getPrimerosBytes()+".255.255.255");
                break;
            case "B":
                ipv4.setDirDeRed(ipv4.getPrimerosBytes()+"."+ipv4.getSegundosBytes()+".0.0");
                ipv4.setMascara("255.255.0.0");
                ipv4.setDirBroadcast(ipv4.getPrimerosBytes()+"."+ipv4.getSegundosBytes()+".255.255");
                break;
            case "C":
                ipv4.setDirDeRed(ipv4.getPrimerosBytes()+"."+ipv4.getSegundosBytes()+"."+ipv4.getTercerosBytes()+".0");
                ipv4.setMascara("255.255.255.0");
                ipv4.setDirBroadcast(ipv4.getPrimerosBytes()+"."+ipv4.getSegundosBytes()+".255"+ipv4.getTercerosBytes()+".255");
                break;
            case "D":
                ipv4.setDirDeRed(ipv4.getPrimerosBytes()+"."+ipv4.getSegundosBytes()+"."+ipv4.getTercerosBytes()+"."+ipv4.getCuartosBytes());
                ipv4.setMascara("255.255.255.255");
                ipv4.setDirBroadcast(ipv4.getPrimerosBytes()+"."+ipv4.getSegundosBytes()+"."+ipv4.getTercerosBytes()+"."+ipv4.getCuartosBytes());
                break;
            case "E":
                ipv4.setDirDeRed(ipv4.getPrimerosBytes()+"."+ipv4.getSegundosBytes()+"."+ipv4.getTercerosBytes()+"."+ipv4.getCuartosBytes());
                ipv4.setMascara("255.255.255.255");
                ipv4.setDirBroadcast(ipv4.getPrimerosBytes()+"."+ipv4.getSegundosBytes()+".255"+ipv4.getTercerosBytes()+"."+ipv4.getCuartosBytes());
                break;
        }
        
        return ipv4;
    }
    

}
