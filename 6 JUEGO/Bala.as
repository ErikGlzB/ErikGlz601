package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	
	public class Bala extends MovieClip {
		
		private var vel: Number = 5;

		public function Bala(pos_x, pos_y) {
			
			x= pos_x;
			y= pos_y + 30;
			
			this.addEventListener( Event.ENTER_FRAME, mover);
			
		}
		
		public function mover(e: Event){
			
			y+= vel;
			if (y >= 380){
				vel= 0;
				stage.removeChild(this);
				this.removeEventListener(Event.ENTER_FRAME, mover);
				}
			
			}

	}
	
}
