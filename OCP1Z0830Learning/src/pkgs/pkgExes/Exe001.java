package pkgs.pkgExes;

import java.util.logging.Logger;

public class Exe001 {



	public static void main(String[] args) {
		new Exe001().go(args);
	}

	private void go(String[] args) {
		var logger = Logger.getLogger("errors");
		logger.info("Code is running");
		logger.warning("Code shouldn't have done that");
	}

}
