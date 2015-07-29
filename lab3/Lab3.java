
public class Lab3 {
    // Authors Ibrahim Mohammed and Harrison Marick

	int timesCalled = 0;

	public void process() {

		timesCalled = timesCalled + 1;

		// get the red, green and blue pixel values of image 0

		int[][] red = Images.getRed(0);
		int[][] blue = Images.getBlue(0);
		int[][] green = Images.getGreen(0);

		int imageWidth = red.length;
		int imageHeight = red[0].length;

		System.out.println(imageWidth +"  "+imageHeight);
		if (timesCalled == 1) {

			// create new arrays for red, green .blue values for new image

			int[][] newred = new int[imageWidth][imageHeight];
			int[][] newblue = new int[imageWidth][imageHeight];
			int[][] newgreen = new int[imageWidth][imageHeight];


			for(int columnNumber = 0; columnNumber< imageWidth ; columnNumber++) {
				for (int rowNumber= 0; rowNumber < imageHeight; rowNumber++) {
				    if (red[columnNumber][rowNumber] < 200){
						newred[columnNumber][rowNumber] = red[columnNumber][rowNumber] + 50;
				    }
				    else if (rowNumber==20){
					    newred[columnNumber][rowNumber]=0;
					    newblue[columnNumber][rowNumber]=0;
					    newgreen[columnNumber][rowNumber]=0;
					}
					else if (rowNumber==10){
					    newred[columnNumber][rowNumber]=255;
					    newblue[columnNumber][rowNumber]=255;
					    newgreen[columnNumber][rowNumber]=255;
						}
					else{
						newred[columnNumber][rowNumber] = red[columnNumber][rowNumber];
					newgreen[columnNumber][rowNumber] = green[columnNumber][rowNumber];
					newblue[columnNumber][rowNumber] = blue[columnNumber][rowNumber];
					}
				}

			}
			// add this new image as image 1 on the screen
			Images.setImage(newred, newgreen, newblue,1);
		}
		else if (timesCalled==2) {
		    
		    int[][] newred = new int[imageWidth][imageHeight];
			int[][] newblue = new int[imageWidth][imageHeight];
			int[][] newgreen = new int[imageWidth][imageHeight];
    
			for(int columnNumber = 0; columnNumber< imageWidth ; columnNumber++) {
				for (int rowNumber= 0; rowNumber < imageHeight; rowNumber++) {
				    if (red[columnNumber][rowNumber] > 200){
						newred[columnNumber][rowNumber] = red[columnNumber][rowNumber] - 50;
					       
				    }
				    else  if (blue[columnNumber][rowNumber] < 200){
						newblue[columnNumber][rowNumber] = blue[columnNumber][rowNumber] + 50;
				    }
				    else{
						newred[columnNumber][rowNumber] = red[columnNumber][rowNumber];
					newgreen[columnNumber][rowNumber] = green[columnNumber][rowNumber];
					newblue[columnNumber][rowNumber] = blue[columnNumber][rowNumber];
					}
				}
			}
				Images.setImage(newred, newgreen, newblue,2);
	       	}
	
		else{
		    int[][] newred = new int[imageWidth][imageHeight];
			int[][] newblue = new int[imageWidth][imageHeight];
			int[][] newgreen = new int[imageWidth][imageHeight];
    
			for(int columnNumber = 0; columnNumber< imageWidth ; columnNumber++) {
				for (int rowNumber= 0; rowNumber < imageHeight; rowNumber++) {
				    if (green[columnNumber][rowNumber] < 200){
						newgreen[columnNumber][rowNumber] = green[columnNumber][rowNumber] + 50;
				    }
				    else if (rowNumber==20){
					    newred[columnNumber][rowNumber]=200;
					    newblue[columnNumber][rowNumber]=200;
					    newgreen[columnNumber][rowNumber]=200;
					}
				    else if (rowNumber==10){
					    newred[columnNumber][rowNumber]=150;
					    newblue[columnNumber][rowNumber]=150;
					    newgreen[columnNumber][rowNumber]=150;
						}
				    else{
						newred[columnNumber][rowNumber] = red[columnNumber][rowNumber];
					newgreen[columnNumber][rowNumber] = green[columnNumber][rowNumber];
					newblue[columnNumber][rowNumber] = blue[columnNumber][rowNumber];
					}
				}
			}
				Images.setImage(newred, newgreen, newblue,3);
	       	}
}}