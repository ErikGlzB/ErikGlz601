package  {
	
	import flash.display.MovieClip;
	
	
	public class Setup extends MovieClip { //Definición de la clase
		private var Fondo_new : Fondo = new Fondo (); //Variables de clase
		private var Piso_new : Piso = new Piso (); 
		private var Protagonista_new : Protagonista = new Protagonista();
		private var Antagonista_new : Antagonista = new Antagonista();
		
		public function Setup() {
			// constructor code
			addChild(Fondo_new);
			addChild(Piso_new); 
			addChild(Protagonista_new);
			addChild(Antagonista_new);
			
			Fondo_new.y = 200;
			Fondo_new.x = 275;
			
			Piso_new.y = 385;
			Piso_new.x = 275;
			
			Protagonista_new.y = 360;
			Protagonista_new.x = 275;
			
			Antagonista_new.y = 50;
			Antagonista_new.x = 275;
		}
		
	}
	
}
