<?php
    define("TITLE", "Meet Ryan");
?>

<!DOCTYPE>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title><?php echo TITLE; ?></title>

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link rel="stylesheet" href="../CSS/styles.css" type="text/css">
        
        <!-- file links -->
        

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <header>
            <div>
                <ul>
                    <li class="headerMenu"><a href="../PHP/home.php">Home</a></li>
                    <li class="headerMenu"><a href="Miguel.php">Meet Miguel</a></li>
                    <li class="headerMenu"><a href="Josh.php">Meet Josh</a></li>
                    <li class="headerMenu"><a href="Cody.php">Meet Cody</a></li>
                </ul>
            </div>
        </header>
        <main>
            <div id="mainRyan">
                <h1 id="h1Ryan"><img src="../images/EGAright.png" alt="EGAright">Ryan Snell<img src="../images/EGAleft.png" alt="EGAleft"></h1>
                <div><img src="../images/rasnellPhoto.jpg"></div>
                <p id="mainPRyan">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ultrices accumsan sapien nec vehicula. Aenean velit neque, malesuada quis nisl ac, sollicitudin aliquet ante. Sed tempor est ligula, nec commodo dui lobortis sit amet. Nullam eget porttitor urna. Cras lacinia vel mauris euismod blandit. Vestibulum eleifend varius nisl, vel rhoncus mi ultrices sed. Maecenas ex urna, fringilla at eros vitae, volutpat tristique erat. Praesent lacinia ante sed purus malesuada, a suscipit risus rutrum. Vivamus a commodo odio, vel dapibus sapien. Ut feugiat neque a venenatis bibendum. Sed at tortor sollicitudin, eleifend mauris in, volutpat enim. Nullam consequat, nulla sit amet venenatis accumsan, eros justo eleifend neque, non porttitor arcu leo vitae nisl.

                Integer vehicula pretium lacus quis dictum. Duis pellentesque ex at lacus laoreet, at faucibus lorem vulputate. Mauris commodo vel felis non dignissim. Etiam tempus est lacus, vitae luctus leo aliquet nec. Sed hendrerit turpis sit amet enim consectetur vestibulum. Quisque fringilla diam enim, ac commodo felis commodo dapibus. Fusce dignissim elementum elit non accumsan.</p>
            </div>
        </main>
        <footer>
            <div class="copyright">
                <h6>Team whateva whateva &copy; 2019.</h6>
            </div>
        </footer>
    </body>
        <!-- jQuery -->
        <script src="//code.jquery.com/jquery-2.1.4.min.js"></script>
        
        <!-- Bootstrap JS -->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</html>