import React, {useState, useEffect } from 'react';
import axios from 'axios';

// This component fetches user data from an API and displays it.

function UserProfile() {

    // State variables to manage user data, loading state, and error messages
    const [user, setUser] = useState(null);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState('');

    //API call to fetch user data
    useEffect(() => {
        setLoading(true);
        axios.get('/api/user/123')
            .then(response => setUser(response.data))
            .catch(error => setError('Error fetching user data'))
            .finally(() => setLoading(false));
    }, []);

    if (loading) return <div>Loading...</div>;
    if (error) return <div>{error}</div>;

    return (
        //How the UI looks
        <div>
            <h1>User Profile</h1>
            {user && (
                <div>
                    <p>Name: {user.name}</p>
                    <p>Email: {user.email}</p>
                    {/* More user details */}
                </div>
            )}
            {/* Additional unrelated UI elements */}
        </div>
    );
}

/*
Solid Principles Applied:
Single Responsibility Principle (SRP) - This single peiasoe of code does a lot of work single some work is done in isolation we are not doing two thing at the same time.

If there are multiple reasons because of which we need to change the code then we are violating the principle


This issue is in the two main parts -
Maintennece and Extendibility
*/