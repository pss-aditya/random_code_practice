import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Chip8 {

    private byte[] memory = new byte[4096];

    private byte[] v = new byte[16];    

    private int pc = 0x200;

    private int I = 0;

    private int[] stack = new int[16];

    private int sp = 0;
    
    private byte delayTimer = 0;

    private byte soundTimer = 0;

    private boolean[] display = new boolean[64 * 32];

    public void loadRom(String filePath) throws IOException {
        byte[] rom = Files.readAllBytes(Path.of(filePath));

        for(int i = 0; i < rom.length; i++)
        {
            memory[0x200 +  i] = rom[i];
        }
    }
}
