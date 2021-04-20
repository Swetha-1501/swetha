import React from 'react';
import UserService from './UserService';

class Usercomponent extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            users:[]
        }
    }
    componentDidMount() {
        UserService.getUsers().then((response) => {
            this.setState({ users: response.data})

        });
    }

    render(){
        return(
            <div>
                <h1 className ="text-center"> List Of Employees</h1>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <td>Emp.Id</td> 
                            <td>Cell No</td> 
                            <td>Email Id</td> 
                            <td>Name</td> 
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.users.map(
                                user =>
                                <tr key ={user.id}>
                                    <td> {user.id} </td>
                                    <td> {user.cellNo} </td>
                                    <td> {user.email} </td>
                                    <td> {user.name} </td>
                                </tr>
                            )
                        }
                    </tbody>
            </table>
          </div>  

                   
        )
    }
}
export default Usercomponent