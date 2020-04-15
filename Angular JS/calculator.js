
$(document).ready(function()
{

//Validation Code For First:
    
    $('#first').keyup(function()
    {
        var first = $(this).val();
        if ( !(/^[a-zA-Z]+$/.test(first)))
        {
            $("#first-err").hide();
        }else{
            $("#first-err").hide();
        }
       }
       )

//Validation Code For Second:
    $('#second').keyup(function()
    {
        var second = $(this).val();
        if ( !(/^[a-zA-Z]+$/.test(second)))
        {
            $("#second-err").hide();
        }else{
            $("#second-err").show();
        }
       }
       )
});


var app = angular.module("mycalc", []);
app.controller("calcCtrl", function($scope) {
    $scope.add = function() {




        var a = parseFloat($scope.first);
        var b = parseFloat($scope.second);
        $scope.result = a+b;
        $scope.first = a+b;
        $scope.second = "";
    }
    $scope.sub = function() {
        var a = parseFloat($scope.first);
        var b = parseFloat($scope.second);
        $scope.result = a-b;
        $scope.first = a-b;
        $scope.second = "";
    }
    $scope.mul = function() {
        var a = parseFloat($scope.first);
        var b = parseFloat($scope.second);
        $scope.result = a*b;
        $scope.first = a*b;
        $scope.second = "";
    }
    $scope.div = function() {
        var a = parseFloat($scope.first);
        var b = parseFloat($scope.second);
        if(b==0)
            $scope.result = "Cannot divide by 0. Enter another number.";
        else
        {
        $scope.result = a/b;
        $scope.first = a/b;
        $scope.second = "";
        }
    }
}); 






























