const UserProfile = ({ user }) => {
    const displayInfo = () => {
        switch (user.role) {
            case 'admin':
                return <AdminView user={user} />;
            case 'editor':
                return <EditorView user={user} />;
            default:
                return <StandardView user={user} />;
        }
    };
    return <div>{displayInfo()}</div>;
};

/*
If a new role is getting added then what to display on the screen the completething goes to change

SWE - 2 Interview the most asked Design Pattern is Strategy Pattern
*/