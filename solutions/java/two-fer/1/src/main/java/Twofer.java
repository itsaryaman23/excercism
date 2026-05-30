public class Twofer {
    public String twofer(String name) {
        if(name==null||name==""||name.length()<1)
            return "One for you, one for me.";
        return "One for "+name+", one for me.";
    }
}
