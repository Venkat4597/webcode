package newtwo;

import panda.dao.Dao;
import newtwo.tool.AppConsole;


public abstract class AppTestCase {
	protected Dao getDao() {
		return AppConsole.i().getDao();
	}
}
