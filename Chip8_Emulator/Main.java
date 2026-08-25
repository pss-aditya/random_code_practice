import java.io.IOException;

public class Main{
    public static void main(String Args[]) throws IOException
    {
        Chip8 cobj = new Chip8();

        cobj.loadRom("roms/Pong.ch8");

        System.out.println("Chip 8 Emulator Started...");
        System.out.println("ROM Loaded Successfully...");
    }

}