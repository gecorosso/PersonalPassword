<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>${title}</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Login Form Template" name="keywords">
        <meta content="Login Form Template" name="description">
        
        <link href="/img/favicon.ico" rel="icon">
       
        <link href="/css/style.css" rel="stylesheet">
        
    </head>
    
    <body>
    	<div class="wrapper login-1">
            <div class="container">
                <div class="col-left">
                    <div class="login-text">
                        <h2>Personal <span style="color: red;"><i>Pass</i></span></h2>
                        <p>Crea il tuo Account<br>Gratuitamente</p>
                        <a class="btn" href="/underPage">Nuovo Utente</a>
                    </div>
                </div>
                <div class="col-right">
                    <div class="login-form">
                        <h2>Login</h2>
                        <form action="/gestionePage" method="post">
                            <p>
                                <label>Username<span>*</span></label>
                                <input name="username" type="text" placeholder="Username or Email" required>
                            </p>
                            <p>
                                <label>Password<span>*</span></label>
                                <input name="password" type="password" placeholder="Password" required>
                            </p>
                            <p>
                                <input type="submit" value="Invio" />
                            </p>
                            <p>
                                <a href="/underPage">Password Dimenticata?</a>
                            </p>
                        </form>
                    </div>
                </div>
            </div>
            
        </div>
        
    </body>
    
</html>
