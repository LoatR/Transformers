#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: US_001 Créer une créature
  En tant que Dieu, je veux que les créatures et les monstres aient des interactions sociales.

  Scenario: SC_001 créer une amitié entre créature et monstre
    Given la creation d une creature
    And d un monstre
    When Dieu le veut
    Then la créature devient ami avec le monstre et le monstre avec la creature
