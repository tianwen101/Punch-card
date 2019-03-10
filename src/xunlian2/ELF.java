package xunlian2;

public class ELF implements Dosong,Domove {
    @Override
    public void move () {
        System.out.println("可移动");
    }

    @Override
    public void song () {
        System.out.println("可歌唱");
    }

    public static void main(String[] args) {
        ELF elf = new ELF();
        System.out.println("精灵");
        elf.move();
        elf.song();
    }
}
