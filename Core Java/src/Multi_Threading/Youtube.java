package Multi_Threading;

public class Youtube extends Thread
{
	public void run()
	{
		play_video()
		{
			System.out.println("Video is play");
		}
		
		play_audio()
		{
			System.out.println("Audio is play");
		}
		
		caption()
		{
			System.out.println("Caption is display");
		}
	}
	

}
