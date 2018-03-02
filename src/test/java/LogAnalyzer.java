import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogAnalyzer {

    LogAnalyzerTest LogAnalyzerTest = new LogAnalyzerTest();

   // private IExtensionManager manager;

    /*public LogAnalyzer(){
            manager = new FileExtensionManager();
    }*/

   /* protected IExtensionManager getExtensionManager(){
        return manager;
    }*/

    /*protected void setExtensionManager(IExtensionManager mgr){
        manager = mgr;
    }*/

   /* public LogAnalyzer(){
       this(new FileExtensionManager());
    }

    public LogAnalyzer(){
        this(new FileExtensionManager());
    }

    public LogAnalyzer(IExtensionManager manager)
    {
        manager = mgr;
    }*/

    private boolean wasLastFilenameValid = false;

    protected final boolean getWasLastFileNameValid()
    {
        return wasLastFilenameValid;
    }

    protected final void setWasLastFilenameValid(boolean value)
    {
         wasLastFilenameValid = value;
    }

    public boolean isValidLogFileName(String Filename)
    {
        //FileExtensionManager mgr = new FileExtensionManager();

        if(Filename == null || Filename.isEmpty())
            throw new IllegalArgumentException("No Filename provided!");

        if(Filename == null || Filename.isEmpty())
            throw new IllegalArgumentException("No filename provided");

       /* if(manager.isValidExtension(filename))
            throw new IllegalArgumentException("Incorrect file extension!");*/

        try{
            FileReader file = new FileReader("Logext.config");
            BufferedReader in = new BufferedReader(file);

            if (!Filename.toLowerCase().endsWith(".SLF"))
                return false;
        }catch (IOException ex) {

        }

        return true;
    }


}
