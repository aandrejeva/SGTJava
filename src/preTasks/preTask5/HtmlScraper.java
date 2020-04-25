package preTasks.preTask5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

//html scraper example

public class HtmlScraper {

	public static void main(String[] args) {
		
		try {
			URL website = new URL ("https://dribbble.com/");
			
			//we gonna read this one with the byte
			ReadableByteChannel channel = Channels.newChannel(website.openStream());
							
			FileOutputStream fileOutputStream = new FileOutputStream("dribbble.html");
			//let's get this channel and transfer from readable byte code 
											//from position 0 to the maximum long
			fileOutputStream.getChannel().transferFrom(channel, 0, Long.MAX_VALUE);
						
		} catch (IOException e) {//typical user's input/output exception
			e.printStackTrace();
		}

	}//end main

}//end class
