import java.io.*;

public class SecretMessage {

    public static void encrypt( String inputFile, String outputFile, int key ) throws IOException, FileNotFoundException {

        InputStreamReader input = null;
		OutputStreamWriter out = null;

        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream outputStream = new FileOutputStream(outputFile);

        input = new InputStreamReader(inputStream);
        out = new OutputStreamWriter(outputStream);

        int c = 0;

        while (c != -1) {
            if (c != 0) {
                out.write(c + key);
            }
            c = input.read();
        }
        System.out.println();

        input.close();
        out.close();
    }
	
	public static void decrypt( String inputFile, String outputFile, int key ) throws IOException, FileNotFoundException {

        InputStreamReader input = null;
		OutputStreamWriter out = null;

        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream outputStream = new FileOutputStream(outputFile);

        input = new InputStreamReader(inputStream);
        out = new OutputStreamWriter(outputStream);

        int c = 0;

        while (c != -1) {
            if (c != 0) {
                out.write(c - key);
            }
            c = input.read();
        }
        System.out.println();

        input.close();
        out.close();
    }

    public static void main( String[] args ) {

        if ( args.length != 4 ) {
            System.out.println( "Usage: java SecretMessage [encrypt|decrypt] inputFile OutputFile key" );
            System.exit( 0 );
        }

		if(args[0].equals("encrypt")){

            try {
                encrypt( args[1],args[2], Integer.parseInt(args[3]));
            } catch ( FileNotFoundException e ) {
                System.err.println( "File not found: "+e.getMessage() );
            } catch (IOException e) {
                System.err.println( "Cannot read/write file: "+e.getMessage() );
            }
		}
		else if(args[0].equals("decrypt")){

		
            try {
                decrypt( args[1],args[2], Integer.parseInt(args[3]));
            } catch ( FileNotFoundException e ) {
                System.err.println( "File not found: "+e.getMessage() );
            } catch (IOException e) {
                System.err.println( "Cannot read/write file: "+e.getMessage() );
            }
        }
		else{
			System.out.println( "Usage: java SecretMessage [encrypt|decrypt] inputFile OutputFile key" );
            System.exit( 0 );
		}
        
    }
}