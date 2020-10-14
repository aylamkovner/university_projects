<?php
    $firstname = $_POST['first'];
    $lastname = $_POST['last'];
    $name = $firstname . ' ' . $lastname;
    $email = $_POST['email'];
    $temp = $_POST['message'];
    $message = "To: $name, we've recieved your message: \n\n $temp";
    $email_subject_line = $_POST['subject'];
    $email_sender = 'a.kovner.1746@kngihts.ucf.edu';
    mail( $email, $email_subject_line, $message, $email_sender);

    header('Location: thanks.html');
?>