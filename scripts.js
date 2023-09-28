function submitForm() {
    // Get form values
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const genderCheckboxes = document.getElementsByName('gender');
    const gender = [];
    genderCheckboxes.forEach(checkbox => {
        if (checkbox.checked) {
            gender.push(checkbox.value);
        }
    });
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    // Validate the form (you can add more specific validation here)
    if (!firstName || !lastName || !dob || !country || gender.length === 0 || !profession || !email || !mobile) {
        alert('All fields are required.');
        return;
    }

    // Display the submitted data in the popup
    const popupData = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${gender.join(', ')}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;

    document.getElementById('popup-data').innerHTML = popupData;

    // Show the popup
    const popup = document.getElementById('popup');
    popup.style.display = 'block';
}

function resetForm() {
    document.getElementById('surveyForm').reset();
}

function closePopup() {
    // Close the popup and reset the form
    const popup = document.getElementById('popup');
    popup.style.display = 'none';
    document.getElementById('surveyForm').reset();
}
