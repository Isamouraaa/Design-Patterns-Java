public class VlcAdapter implements MediaPlayer {
    private VlcPlayer vlcPlayer;

    public VlcAdapter(VlcPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void play(String nomeArquivo) {
        vlcPlayer.playVlcStream(nomeArquivo, true); 
    }
}