import { Link,Outlet } from "react-router-dom";
/**
 * Link is used to set the URL and keep track of brwosing history
 * Outlet - renders the current route selected
 * 
 * http://serveripaddress:portonwhichserverisrunning/resource
 */
function Home(){
    return (
        <>
            <nav>
            <ul>
                <li>
                    <Link to="/login"> Login</Link>
                </li>
                <li>
                    <Link to="/userregistration"> Register Yourself</Link>
                </li>
                <li>
                    <Link to="/amazon">Amazon</Link>
                </li>
            </ul>
            </nav>
            <Outlet />
        </>
    );
}


export default Home;