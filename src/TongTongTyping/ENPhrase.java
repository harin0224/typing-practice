package TongTongTyping;

public class ENPhrase extends Phrase {
	
	String alphabet[] = {"A\n","a\n","B\n","b\n","C\n","c\n","D\n","d\n","E\n",
			"e\n","F\n","f\n","G\n","g\n","H\n","h\n","I\n","i\n","J\n",
			"j\n","K\n","k\n","L\n","l\n","M\n","m\n","N\n","n\n","O\n",
			"o\n","P\n","p\n","Q\n","q\n","R\n","r\n","S\n","s\n","T\n",
			"t\n","U\n","u\n","V\n","v\n","W\n","w\n","X\n","x\n","Y\n","y\n","Z\n","z\n"}; //¾ËÆÄºª
	
	String shortP[]= {"A bad workman always blames his tools\n",
			"A black ox has trod on his way\n","A burnt child dreads the fire\n",
			"A big fish in a little pond\n","A bird in the hand is worth two in the bush\n",
			"A bad workman blames his tools\n","Always put your best foot forward\n",
			"Beggars can¡¯t be choosers\n","Better late than never\r\n","Casting pearls before swine\n",
			"Charity begins at home\n","Do not count your chickens before they hatch\n",
			"Don¡¯t make a mountain out of an anthill\n","Don¡¯t cross the bridge until you come to it\n",
			"Even Homer sometimes nods\n","Failure is but a stepping stone to success\n","Honesty is the best policy\n",
			"It¡¯s better to be safe than sorry\n","Look before you leap\n","Many hands make light work\n",
			"Practice makes perfect\n","Rome wasn¡¯t built in a day\n","Strike while the iron is hot\n",
			"Too many cooks spoil the broth\n","The more, the better\n","The early bird catches the worm\n",
			"The cat is out of the bag\n","Two wrongs don¡¯t make a right\n","You can¡¯t have your cake and eat it too\n",
			"When in Rome, do as the Romans do\n","Where there¡¯s a will, there¡¯s a way\n"}; //ÂªÀº ±Û
	
	String longP_1[]= {"2019 English Section of Korean S.A.T Special Lecture Ch3 8/n", 
			"One of the most important things that young adults need to understand is that any time you are trying to live a normal and decent life,/n", 
			"you will always find people that will hate you for that./n", "That is how most young people compromise in some situations./n", 
			"They give up on what they believe is right and go with the crowd,/n", "They give up on what they believe is right and go with the crowd,/n", 
			"and later pay the consequences./n", "What you have to understand is that people who hate you are jealous because of the fact that they cannot have such good behaviors,/n", 
			"so they choose to hate you./n", "When you have something good./n", "don't give it up for foolish people who never stand for anything good./n", 
			"It's better for them to call you names for your good behaviors than for you to compromise with them./n", 
			"They can call you old-fasioned;/n","whatever they want, it's their business./n"}; //¼ö´É Æ¯°­
	
	String longP_2[] = {"I SEE THE LIGHT/n", "All those days watching from the windows/n", "All those years outside looking in/n", 
			"All that time never even knowing/n", "Just how blind I've been/n", "Now I'm here blinking in the starlight/n", 
			"Now I'm here suddenly I see/n", "Standing here it's all so clear/n", "I'm where I'm meant to be/n",
			"And at last I see the light/n", "And it's like the fog has lifted/n", "And at last I see the light/n", 
			"And it's like the sky is new/n", "And it's warm and real and bright/n", "And the world has somehow shifted/n", 
			"All at once everything looks different/n", "Now that I see you/n", "All those days chasing down a daydream/n", 
			"All those years living in a blur/n", "All that time never truly seeing/n", "Things the way they were/n", 
			"Now she's here shining in the starlight/n", "Now she's here suddenly I know/n", "If she's here it's crystal clear/n",
			"I'm where I'm meant to go/n", "And at last I see the light/n", "And it's like the sky is new/n", 
			"And it's warm and real and bright/n", "And the world has somehow shifted/n", "All at once everything looks different/n", 
			"Now that I see you/n", "Now that I see you/n"}; //¹ºÁö ¸ð¸£°Ú³×
	
	//save file
	void saveAlphabet() {
		ad = "C:\\Users\\21928199\\.eclipse\\EnAlphabet.text\\";
		filem.save(ad, alphabet);
	}
	
	void saveShort() {
		ad= "C:\\Users\\21928199\\.eclipse\\EnShort.text\\";
		filem.save(ad, shortP);
	}
	
	void saveLong_1() {
		ad= "C:\\Users\\21928199\\.eclipse\\Elong_1.text\\";
		filem.Longsave(ad, longP_1);
	}
	
	void saveLong_2() {
		ad= "C:\\Users\\21928199\\.eclipse\\EnLong_2.text\\";
		filem.Longsave(ad, longP_2);
	}
	
	//show file
	void showAlphabet() {
		saveAlphabet();
		ad = "C:\\Users\\21928199\\.eclipse\\EnAlphabet.text\\";
		filem.showfile(ad);
	}
	
	void showShort() {
		saveShort();
		ad= "C:\\Users\\21928199\\.eclipse\\EnShort.text\\";
		filem.showfile(ad);
	}
	
	void showLong_1() {
		saveLong_1();
		ad= "C:\\Users\\21928199\\.eclipse\\Elong_1.text\\";
		filem.showfile(ad);
	}
	
	void showLong_2() {
		saveLong_2();
		ad= "C:\\Users\\21928199\\.eclipse\\Elong_2.text\\";
		filem.showfile(ad);
	}
}