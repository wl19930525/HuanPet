package app.jiyun.com.testsqlitegd;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.huanpet.huanpet.bean.MyLoginBean;
import com.huanpet.huanpet.bean.UserBean;

import app.jiyun.com.testsqlitegd.MyLoginBeanDao;
import app.jiyun.com.testsqlitegd.UserBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig myLoginBeanDaoConfig;
    private final DaoConfig userBeanDaoConfig;

    private final MyLoginBeanDao myLoginBeanDao;
    private final UserBeanDao userBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        myLoginBeanDaoConfig = daoConfigMap.get(MyLoginBeanDao.class).clone();
        myLoginBeanDaoConfig.initIdentityScope(type);

        userBeanDaoConfig = daoConfigMap.get(UserBeanDao.class).clone();
        userBeanDaoConfig.initIdentityScope(type);

        myLoginBeanDao = new MyLoginBeanDao(myLoginBeanDaoConfig, this);
        userBeanDao = new UserBeanDao(userBeanDaoConfig, this);

        registerDao(MyLoginBean.class, myLoginBeanDao);
        registerDao(UserBean.class, userBeanDao);
    }
    
    public void clear() {
        myLoginBeanDaoConfig.clearIdentityScope();
        userBeanDaoConfig.clearIdentityScope();
    }

    public MyLoginBeanDao getMyLoginBeanDao() {
        return myLoginBeanDao;
    }

    public UserBeanDao getUserBeanDao() {
        return userBeanDao;
    }

}