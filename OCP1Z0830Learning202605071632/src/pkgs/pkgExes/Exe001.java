package pkgs.pkgExes;



public class Exe001 {



	public static void main(String[] args) {
		new Exe001().go(args);
	}

	private void go(String[] args) {
		String s = null;

		s = "abcde";
		System.out.println("[s="+(s)+"]"+"");
		s = "a"+'\n'+'\t'+"b"+'\n'+'\s'+'\s'+"c"+'\n'+"d"+'\n'+"e";
		System.out.println("[s="+(s)+"]"+"");
		System.out.println("[s.translateEscapes()="+(s.translateEscapes())+"]"+"");
		s = "a\n\tb\n\s\sc\nd\ne";
		System.out.println("[s="+(s)+"]"+"");
		System.out.println("[s.translateEscapes()="+(s.translateEscapes())+"]"+"");
		s = "a\\n\\tb\\n\\s\\sc\\nd\\ne";
		System.out.println("[s="+(s)+"]"+"");
		System.out.println("[s.translateEscapes()="+(s.translateEscapes())+"]"+"");
		//s = """abc";//compilation problem: Syntax error on token ""abc"", delete this token
		s = """
				a
					b
				  c
				d
				e""";
		System.out.println("[s="+(s)+"]"+"");
		System.out.println("[s.translateEscapes()="+(s.translateEscapes())+"]"+"");
		s = """
					a
						b
				  	  c
					d
					e""";
		System.out.println("[s="+(s)+"]"+"");
		System.out.println("[s.strip()="+(s.strip())+"]"+"");
		System.out.println("[s.indent(-10)="+(s.indent(-10))+"]"+"");
		System.out.println("[s.indent(-1)="+(s.indent(-1))+"]"+"");
		System.out.println("[s.indent(10)="+(s.indent(10))+"]"+"");
		System.out.println("[s.indent(1)="+(s.indent(1))+"]"+"");
		System.out.println("[s.stripIndent()="+(s.stripIndent())+"]"+"");
		System.out.println("[s.strip()="+(s.strip())+"]"+"");
		s = " "+s+" ";
		System.out.println("[s="+(s)+"]"+"");
		System.out.println("[s.trim()="+(s.trim())+"]"+"");
		System.out.println("[s.strip()="+(s.strip())+"]"+"");
	}

}
