public class Main {
    public static void main(String[] args) {
        VlcPlayer servicoVlc = new VlcPlayer();

        MediaPlayer player = new VlcAdapter(servicoVlc);
 
        player.play("video_aula_padroes.vlc");
    }
}