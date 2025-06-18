import ProfileViewSelector from "./ProfileViewSelector";

const UserProfile = ({ user }) => {
    const ProfileView = ProfileViewSelector.getProfileView(user.role);
    return <ProfileView user={user} />
}

export default UserProfile;

/*
Writing the factor or the Selector class for the ProfileViewSelector. Userprofile should not render any thing else it should just show the ProfileView based on the role of the user.

For adding a new functionality if are smelling that we have to change in a lot of code and in a lot of files then we can say that the OCP is getting violated
*/

